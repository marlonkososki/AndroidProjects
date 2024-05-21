package com.example.reservamesa.model

object MesaDataStore {

    var mesas : MutableList<Mesa> = arrayListOf()

    init {
        addMesa(Mesa(1,"Fundos", "Reservada", 4))
        addMesa(Mesa(2,"Frente","Livre", 5))
        addMesa(Mesa(3,"Fundos", "Livre", 10))
    }


    fun getMesa(position: Int): Mesa {
        return mesas[position]
    }

    fun addMesa(mesa: Mesa) {
        mesas.add(mesa)
    }

    fun editMesa(position: Int, mesa: Mesa){
        mesas[position] = mesa
    }

    fun removeMesa(position: Int){
        mesas.removeAt(position)
    }


}