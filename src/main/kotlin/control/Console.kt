package control

class Console private constructor() {

    companion object {
        fun readInt(msg: String): Int {
            var resolve: Int? = null

            do {
                println(msg)
                val info = readlnOrNull()

                if (info !== null && info !== "") {
                    resolve = info.toIntOrNull()

                    if (resolve === null || resolve <= 0) {
                        println("Invalid value!")
                    }
                }
            } while (resolve === null || resolve <= 0)

            return resolve
        }

        fun readString(msg: String): String {
            var resolve: String? = null

            do {
                println(msg)
                val info = readlnOrNull()

                if (info != null && info.trim() != "") {
                    resolve = info.lowercase()
                } else {
                    println("Invalid value!")
                }
            } while (resolve == null)

            return resolve
        }
    }
}