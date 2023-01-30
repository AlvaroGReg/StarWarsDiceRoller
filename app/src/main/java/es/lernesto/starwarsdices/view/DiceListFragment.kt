package es.lernesto.starwarsdices.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.lernesto.starwarsdices.R
import es.lernesto.starwarsdices.controller.DicesAdapter
import es.lernesto.starwarsdices.controller.MainViewModel
import es.lernesto.starwarsdices.model.RollModel


class DiceListFragment: Fragment() {

//  lateinit var binding: FragmentDicesListBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: DicesAdapter
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dices_list, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = GridLayoutManager(context,4)
        recyclerView = view.findViewById(R.id.recycler_view_dices)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = DicesAdapter()
        recyclerView.adapter = adapter
    }

}