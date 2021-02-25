package lecture3

data class DeqElement<T>(val value : T, var next : DeqElement<T>? = null, var prev : DeqElement<T>? = null)
