package br.com.tecnisys.okd.escalabilidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController("/")
public class Endpoint {

    @GetMapping
    public Dados getHostname() throws Exception{
        Dados dados = new Dados();
        dados.setHostname(InetAddress.getLocalHost().getHostName());
        dados.setIp(InetAddress.getLocalHost().getHostAddress());
        return dados;
    }
}
