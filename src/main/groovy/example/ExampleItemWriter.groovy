package example

import groovy.util.logging.Log

import org.springframework.batch.item.ItemWriter

/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 */
@Log
class ExampleItemWriter implements ItemWriter<Object> {

	void write(List<? extends Object> data) {
		log.info data.toString()
	}
}

