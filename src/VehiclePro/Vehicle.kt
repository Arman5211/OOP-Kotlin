package VehiclePro

class Vehicle (var model: String = "",var brand: String = "",var engine: String = "",var seat: Int,var madeIn: String = ""){
    init {
        println("Vehicle model is: $model")
        println("Vehicle brand is: $brand")
        println("Vehicle engine is: $engine")
        println("Vehicle seat is: $seat")
        println("Vehicle madeIn is: $madeIn")
    }

    fun horny(){
        println("Sound is pip pip pip")

    }
}
