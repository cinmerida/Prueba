import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import ticker.TickerServiceHandler

object Main extends App {
  implicit val system = ActorSystem("ticker")

  Http().bindAndHandleAsync(
    TickerServiceHandler(new TickerServiceImpl),
    "127.0.0.1",
    8080
  )
}