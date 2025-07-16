//package academy.italo.maratonajava.fernanda.networking.consumindoapi;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class ServicoDeCep {
//    static String webService = "http://viacep.com.br/ws/72225273/json";
//    static int codigoSucesso = 200;
//
//    public static Endereco buscarEnderecoPeloCep(String cep){
//        String urlParaChamada = webService + cep + "/json";
//        try {
//            URL url = new URL(urlParaChamada);
//            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
//
//            if(conexao.getResponseCode() != codigoSucesso){
//                throw new RuntimeException("Erro caralho: " + conexao.getResponseCode());
//            }
//        } catch (RuntimeException | IOException e ) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
