import kotlin.system.exitProcess

private val employee = Employee()
private val option = DeliveryOption()
private var input = -1
private var price = -1
private val menuList = listOf(      // Creating Object & Properties Using List
    Menu(
        name = "Ayam Bakar",
        price = 50_000
    ),
    Menu(
        name = "Ayam Goreng",
        price = 40_000
    ),
    Menu(
        name = "Ayam Geprek",
        price = 40_000
    ),
    Menu(
        name = "Kulit Ayam Crispy",
        price = 15_000
    ),
    Menu(
        name = "Sate Usus Ayam",
        price = 5_000
    )
)

fun main() {
    printMenu()
    choice()
    pay()
    option.printOption()
    employee.deliveryProcess()
    exitProcess(0)
}

fun printMenu() {
    println("\n==================================")
    println("Daftar Menu :")
    println("==================================")
    menuList.forEachIndexed { index, data ->
        println("${index + 1}.${data.name} : ${data.price}")
    }
    println("==================================")
    println("Pilih Menu Makanan : ")
}

fun choice() {
    try {
        input = readln().toInt()
        when (input) {
            1 -> {
                println("Anda Memilih Menu 1")
                println("Nama Menu : ${menuList[0].name}")
                println("Harga : Rp ${menuList[0].price}")
                price = menuList[0].price
            }

            2 -> {
                println("Anda Memilih Menu 2")
                println("Nama Menu : ${menuList[1].name}")
                println("Harga : Rp ${menuList[1].price}")
                price = menuList[1].price
            }

            3 -> {
                println("Anda Milih Menu 3")
                println("Nama Menu : ${menuList[2].name}")
                println("Harga : Rp ${menuList[2].price}")
                price = menuList[2].price
            }

            4 -> {
                println("Anda Memilih Menu 4")
                println("Nama Menu : ${menuList[3].name}")
                println("Harga : Rp ${menuList[3].price}")
                price = menuList[3].price
            }

            5 -> {
                println("Anda Memilih Menu 5")
                println("Nama Menu : ${menuList[4].name}")
                println("Harga : Rp ${menuList[4].price}")
                price = menuList[4].price
            }

            else -> {
                println("Salah Input")
                choice()
            }
        }
    } catch (e: NumberFormatException) {
        println("Masukkan Input Angka")
        choice()
    }
}

fun pay() {
    println("Masukkan Nominal Anda :")
    try {
        input = readln().toInt()
        if (input >= price) {
            val balance = input - price
            println("Pembayaran Berhasil, Kembalian Anda : $balance")
        } else {
            println("Pembayaran Gagal, Saldo Anda Tidak Mencukupi")
            main()
        }
    } catch (e: NumberFormatException) {
        println("Masukkan Input Angka")
        pay()
    }
}