package es.lernesto.starwarsdices.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.lernesto.starwarsdices.R
import es.lernesto.starwarsdices.databinding.FragmentDicesListBinding

class DicesListFragment : Fragment() {

    private lateinit var binding: FragmentDicesListBinding

//    companion object {
//        fun newInstance() = DicesListFragment()
//    }
//    private lateinit var viewModel: DicesListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDicesListBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


//        viewModel = ViewModelProvider(this).get(DicesListViewModel::class.java)
        // TODO: Use the ViewModel

    }

}