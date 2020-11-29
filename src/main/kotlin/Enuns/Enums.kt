enum class Color(var r:Int, var g:Int, var b:Int) {
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255);

    fun rgb() = (r*256+g)*256+b
}

enum class BeerKind() {
    IPA,
    APA,
    STOUT
}

// Enum Constants as Anonymous Classes
enum class Beer() {
    INDICA {
        override fun getBeerKind() = BeerKind.IPA
    },
    ROLETA_RUSSA {
        override fun getBeerKind() = BeerKind.APA
    },
    GUINNESS {
        override fun getBeerKind() = BeerKind.STOUT
    };

    abstract fun getBeerKind():BeerKind
}

// Enums Implementing Interfaces

interface ICardLimit {
    fun getMaxLimit(): Int
}

enum class CardType : ICardLimit {
    SILVER {
        override fun getMaxLimit(): Int {
            return 1000
        }
    },
    GOLD {
        override fun getMaxLimit(): Int {
            return 10000
        }
    },
    PLATINUM {
        override fun getMaxLimit(): Int {
            return 50000
        }
    }
}