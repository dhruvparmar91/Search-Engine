package Indexer;

public class DocumentModel {

	private String url;

	private Integer tf;

	private Double idf;

	private Double tfidf;

	public DocumentModel() {

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getTf() {
		return tf;
	}

	public void setTf(Integer tf) {
		this.tf = tf;
	}

	public Double getIdf() {
		return idf;
	}

	public void setIdf(Double idf) {
		this.idf = idf;
	}

	public Double getTfidf() {
		return tfidf;
	}

	public void setTfidf(Double tfidf) {
		this.tfidf = tfidf;
	}

}
