package tortora.web.api.handler;

public class CampoRequeridoException extends BusinessException {

    public CampoRequeridoException(String campo) {
        super("O campo %s é obrigatorio", campo);
    }

}
