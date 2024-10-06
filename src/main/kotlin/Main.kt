fun main() {
    embeddedServer(Netty, port = 8081) {
        routing {
            get("/") {
                call.respondText("Welcome to Lyft-Frontend!")
            }
            get("/ride") {
                call.respondText("Request a ride!")
            }
        }
    }.start(wait = true)
}
