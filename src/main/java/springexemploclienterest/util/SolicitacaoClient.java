package springexemploclienterest.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.util.UriComponentsBuilder;
import springexemploclienterest.model.dto.ClasseExemplo;

public class SolicitacaoClient extends HttpRestClient<ClasseExemplo> {
    private static final String urlBase = "http://localhost:8080/endPoint";

    public SolicitacaoClient(ClasseExemplo classeExemplo) {
        setUrl(resolveUri(classeExemplo));
        setHttpMethod(HttpMethod.GET);
        setHttpEntity(null); // Usado para autenticação. Exemplo de uso para autenticação:
        // setHttpEntity(new HttpEntity<DadosConsultaCidadao>(createHeaders(token)));
        setClasse(ClasseExemplo.class);
    }

    private String resolveUri(ClasseExemplo classeExemplo) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(urlBase);
        builder = builder.queryParam("param1", classeExemplo.getParam1());
        builder = builder.queryParam("param2", classeExemplo.getParam2());
        builder = builder.queryParam("param3", classeExemplo.getParam3());
        return builder.buildAndExpand().toUri().toString();
    }

    /* Exemplo de autenticação
     * Já foi testado em outra aplicação. Neste exemplo não é usado,
     * mas foi adicionado para fim de documentação.
     * */
    private HttpHeaders createHeaders(String token){
        return new HttpHeaders() {
            {
                String auth = token;
                String authHeader = "Bearer " + auth;
                set("authorization", authHeader);
            }
        };
    }

    public static String getUrlBase() {
        return urlBase;
    }
}
