public class Codec {

    private static final String BaseUrl = "http://tinyurl.com/";        
   
    private Map<String, String> map = new HashMap<>();
    
    public String encode(String longUrl) {
        String hash = ((Integer) longUrl.hashCode()).toString();
        map.put(hash, longUrl);
        return BaseUrl + hash;
    }
    
    public String decode(String shortUrl) {
        return map.get(shortUrl.substring(BaseUrl.length()));
    }
}
