package springexemploclienterest.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpRestClient<T> {
    private String url;
    private HttpMethod httpMethod;
    private HttpEntity<T> httpEntity;
    private Class<T> classe;

    public ResponseEntity<T> getResponseEntity() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(getUrl(),getHttpMethod(),getHttpEntity(),getClasse());
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
    }

    public HttpEntity<T> getHttpEntity() {
        return httpEntity;
    }

    public void setHttpEntity(HttpEntity<T> httpEntity) {
        this.httpEntity = httpEntity;
    }

    public Class<T> getClasse() {
        return classe;
    }

    public void setClasse(Class<T> classe) {
        this.classe = classe;
    }
}
