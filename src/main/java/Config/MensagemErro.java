package Config;

public class MensagemErro {

        public String mensagem;
        public String campo;

        public MensagemErro(String mensagem, String campo) {
            this.mensagem = mensagem;
            this.campo = campo;
        }

        public String getMensagem() {
            return mensagem;
        }

        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }
    }

