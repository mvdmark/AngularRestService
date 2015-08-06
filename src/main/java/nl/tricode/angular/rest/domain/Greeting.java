package nl.tricode.angular.rest.domain;

/**
 * Created by mvdmark on 6-8-2015.
 */
public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}