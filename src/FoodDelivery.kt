open class FoodDelivery {
    open fun printOption() {        // Function Overriding
        println("Pilih Metode Pengiriman Makanan : ")
        println("1. Take Away")
        println("2. Regular Delivery")
        println("3. 5 Minute Delivery")
        println("4. Long Range Delivery")
        println("Pilihan Anda : ")
    }
}

class DeliveryOption : FoodDelivery() {
    override fun printOption() {
        println("Pilih Metode Pengiriman Makanan : ")
        println("1. Take Away")
        println("2. Delivery")
        println("Pilihan Anda : ")
    }
}

