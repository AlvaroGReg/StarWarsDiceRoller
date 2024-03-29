package es.lernesto.starwarsdices

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.concurrent.RecursiveAction

class DicesAdapter (): RecyclerView.Adapter<DicesAdapter.DicesViewHolder>(){

    private val data: DicesData = DicesData
    private val dicesList : List<DiceModel> = data.dices

    class DicesViewHolder (view:View):RecyclerView.ViewHolder(view){
        val textViewName: TextView= view.findViewById(R.id.textView_diceName)
        val imageViewDice: ImageView= view.findViewById(R.id.imageView_dice)
        val imageViewAdd: ImageView= view.findViewById(R.id.btn_add)
        val imageViewRemove: ImageView = view.findViewById(R.id.btn_remove)
        val textViewCount: TextView = view.findViewById(R.id.textView_dice_count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DicesViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.dices_item,parent, false)
        return DicesViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DicesViewHolder, position: Int) {

        val item = dicesList[position]
        holder.textViewName.text = item.name
        holder.imageViewDice.setImageResource(item.imageResourceId)

        holder.imageViewAdd.setOnClickListener {
            var num : Int = holder.textViewCount.text.toString().toInt()
            num++
            holder.textViewCount.text = num.toString()
        }

        holder.imageViewRemove.setOnClickListener {
            var num : Int = holder.textViewCount.text.toString().toInt()
            num--
            holder.textViewCount.text = num.toString()
        }
    }
    override fun getItemCount(): Int {return dicesList.size}
}
