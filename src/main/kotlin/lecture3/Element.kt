package lecture3

data class Element<T>(var value: T, var next: Element<T>? = null)
