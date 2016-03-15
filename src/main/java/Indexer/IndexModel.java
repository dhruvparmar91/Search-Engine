package Indexer;

import java.util.List;
import java.util.Set;

public class IndexModel {
	
	String keyword;
	
	Set<DocumentModel> documents;
	
	public IndexModel() {
		
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Set<DocumentModel> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<DocumentModel> documents) {
		this.documents = documents;
	}
	
	public void addDocument(DocumentModel documentModel) {
		this.documents.add(documentModel);
	}

}
