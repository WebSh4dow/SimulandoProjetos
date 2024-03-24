package org.portalmanagerdementirinha.minhafaqs.service;

import org.portalmanagerdementirinha.minhafaqs.requisicao.CEPRequest;
import org.portalmanagerdementirinha.minhafaqs.resposta.CEPResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CEPService {
    public ResponseEntity<CEPResponse> pesquisaCep(CEPRequest meuCepRequest) {

        RestTemplate meuRestTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/" + meuCepRequest.getCep() + "/json/";
        CEPResponse meuCepResponse = meuRestTemplate.getForObject(url, CEPResponse.class);
        return new ResponseEntity<CEPResponse>(meuCepResponse, HttpStatus.OK);
    }
    public String pesquisaRua(String uf, String cidade, String logradouro){
        RestTemplate meuRestTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/"+ uf+"/"+cidade+"/"+logradouro+"/json";
        ResponseEntity<String> meuResponse = meuRestTemplate.getForEntity(url,String.class);

        return meuResponse.getBody();
    }
}
