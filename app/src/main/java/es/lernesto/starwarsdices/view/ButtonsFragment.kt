package es.lernesto.starwarsdices.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import es.lernesto.starwarsdices.controller.MainViewModel
import es.lernesto.starwarsdices.databinding.ButtonsFragmentBinding
import kotlin.properties.ReadOnlyProperty


class ButtonsFragment: Fragment() {

    private var _binding: ButtonsFragmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ButtonsFragmentBinding.inflate(inflater,container,false)

        binding.btnRolldices.setOnClickListener {
        }

        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}