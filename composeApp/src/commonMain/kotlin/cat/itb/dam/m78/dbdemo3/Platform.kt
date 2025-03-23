package cat.itb.dam.m78.dbdemo3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform