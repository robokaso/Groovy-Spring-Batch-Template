package example

import groovy.util.logging.Log

import java.util.List

import org.springframework.batch.item.ItemWriter
import org.springframework.stereotype.Component

/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 */
@Log
@Component('writer')
class ExampleItemWriter implements ItemWriter<Object> {

	void write(List<? extends Object> data) {
		log.info data.toString()
	}
}

