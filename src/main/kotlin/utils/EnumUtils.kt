package utils

class EnumUtils {

    /**
     * Check if the string name is contained in the enum
     * @param name The string name of the enum value to check
     * @return True if its contained
     */
    inline fun <reified T : Enum<T>> contains(name: String?): Boolean {
        return enumValues<T>().any { it.name == name}
    }
}