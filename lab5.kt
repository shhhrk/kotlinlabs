fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = SUPPORTED.contains(requested.uppercase())
    println("Поддержка протокола $requested: $isSupported")
}
