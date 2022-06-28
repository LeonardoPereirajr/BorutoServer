package borutoserver.com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse (
    val sucess: Boolean,
    val message: String? = null,
    val prevPag: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList()
)