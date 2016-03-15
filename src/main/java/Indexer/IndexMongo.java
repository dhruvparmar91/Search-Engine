package Indexer;

import java.util.Map;
import java.util.Set;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class IndexMongo {

	private MongoClient mongoClient;

	public IndexMongo() {
		this.mongoClient = new MongoClient("localhost");
	}

	public void StoreRank(String url, Double rank) {
		
	}

}
