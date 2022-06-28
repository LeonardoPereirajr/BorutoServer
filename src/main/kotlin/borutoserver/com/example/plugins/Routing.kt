
package borutoserver.com.example.plugins

import borutoserver.com.example.routes.root
import io.ktor.application.*
import io.ktor.routing.*


fun Application.configureRouting() {
    routing {
        root()
    }
}
