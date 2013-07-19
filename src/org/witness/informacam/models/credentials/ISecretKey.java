package org.witness.informacam.models.credentials;

import java.io.Serializable;

import org.json.JSONObject;
import org.witness.informacam.models.Model;

@SuppressWarnings("serial")
public class ISecretKey extends Model implements Serializable {
	public String pgpKeyFingerprint = null;
	public String secretAuthToken = null;
	public String secretKey = null;
	
	public ISecretKey() {
		super();
	}
	
	public ISecretKey(ISecretKey secretKey) {
		super();
		inflate(secretKey.asJson());
	}
	
	public ISecretKey(JSONObject secretKey) {
		super();
		inflate(secretKey);
	}
}
