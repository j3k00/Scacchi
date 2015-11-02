package model;

import view.View;

public class ScacchiModel implements Model {
	private ConfigurazioneScacchiera configurazione;
	private View view;
	
	public ScacchiModel(ConfigurazioneScacchiera configurazione){
		this.configurazione = configurazione;
	}
	
	public Pezzo getPezzo(int x,int y){
		return configurazione.getPezzo(x, y);
	}
	
	public ConfigurazioneScacchiera getConfigurazione(){
		return configurazione;
	}
	
	public void setConfigurazione(ConfigurazioneScacchiera configurazione){
		//modifica configurazione se è già stata modificata, altrimenti non ha senso
		if (this.configurazione != configurazione) {
			this.configurazione = configurazione;
			if (view != null)
				view.onConfigurationChange();
		}
	};
	
	public void setView(View view){
		this.view = view;
	}
}
