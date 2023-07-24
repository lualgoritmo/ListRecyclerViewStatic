    import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customview.databinding.ItemCardBinding
import com.example.customview.domain.model.DataCard

class DataCardAdapter(private val onClick: (DataCard) -> Unit) :
    RecyclerView.Adapter<DataCardAdapter.DataCardViewHolder>() {

    private var listCard: MutableList<DataCard> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataCardViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataCardViewHolder(binding)
    }

    override fun getItemCount(): Int = listCard.size

    override fun onBindViewHolder(holder: DataCardViewHolder, position: Int) {
        val cardList = listCard[position]
        holder.bind(cardList)
        holder.itemView.setOnClickListener { onClick(cardList) }
    }

    fun updateCard(newList: MutableList<DataCard>) {
        listCard = newList
        notifyDataSetChanged()
    }

    inner class DataCardViewHolder(private val binding: ItemCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(dataCard: DataCard) {
            binding.imgCard.setImageResource(dataCard.cardImg)
            binding.tvTextMain.text = dataCard.tvTextMain
            binding.tvTextSimple.text = dataCard.textSimple
            binding.tvTextRegular.text = dataCard.textRegular
            binding.tvRSimple.text = dataCard.textRsimple

            val shapeDrawable = GradientDrawable()
            shapeDrawable.shape = GradientDrawable.RECTANGLE
            shapeDrawable.cornerRadius = 12.0f
            shapeDrawable.setStroke(2, dataCard.colorStroke)
            shapeDrawable.setColor(dataCard.colorCard)
            binding.ctlItemCard.background = shapeDrawable
        }
    }
}
