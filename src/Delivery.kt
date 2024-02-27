open class Delivery {     // Inheritance Class
    fun deliveryProcess() {
        try {
            val input = readln().toInt()
            when (input) {
                1 -> {
                    println("Anda Memilih Menu 1")
                    println("Makananmu Sedang Dimasak")
                    for (i in 5 downTo 1) {
                        println(i)
                        Thread.sleep(1000)
                    }
                    println("Makananmu Sudah Siap! Silakan Ambil di Resto!")
                    for (i in 5 downTo 1) {
                        Thread.sleep(1000)
                    }
                    println("Pesanan Selesai!")
                    Thread.sleep(3000)
                }

                2 -> {
                    println("Anda Memilih Menu 2")
                    println("Makananmu Sedang Dimasak")
                    for (i in 5 downTo 1) {
                        println(i)
                        Thread.sleep(1000)
                    }
                    println("Makananmu Sudah Siap! Driver Segera Menuju Tempatmu!")
                    for (i in 5 downTo 1) {
                        Thread.sleep(1000)
                    }
                    println("Pesanan Selesai!")
                    Thread.sleep(3000)
                }

                else -> {
                    println("Salah Input")
                    deliveryProcess()
                }
            }
        } catch (e: NumberFormatException) {
            println("Masukkan Input Angka")
            deliveryProcess()
        }
    }
}

class Employee : Delivery()