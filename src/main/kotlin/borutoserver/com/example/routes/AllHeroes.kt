package borutoserver.com.example.routes

import borutosertver.com.example.repository.HeroRepository
import borutoserver.com.example.models.ApiResponse
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHeroes(){
    get("/boruto/heroes"){
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            call.respond(message = page)
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(sucess = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}