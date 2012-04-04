import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.WARN

appender("stdout", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
//	pattern = "%d %p [%c] - <%m>%n"
	pattern = "%d [%thread] [%level] %logger - %msg%n"
  }
}
logger("org.springframework.batch", INFO)
logger("example", INFO)
root(WARN, ["stdout"])