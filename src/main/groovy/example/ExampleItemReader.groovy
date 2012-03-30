package example

import org.springframework.batch.item.ItemReader

/**
 * Returns the inputs set to the {@link #inputs} property.
 * 
 * @author Robert Kasanicky
 */
class ExampleItemReader implements ItemReader<Object> {

	List inputs = []
	
	private int index = 0
	
	/**
	 * Reads next record from input
	 */
	Object read() {
		index < inputs.size() ? inputs[index++] : null
	}

}
