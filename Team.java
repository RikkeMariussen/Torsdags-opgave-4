class Team{

	private String teamName;
	private int teamRank;
	private String teamMemberName;


	public Team (String teamName, int teamRank){
		this.teamName = teamName;
		this.teamRank = teamRank;
	}
	
	
		public String getTeamName(){
			return this.teamName;
		}

		public void setTeamName (String teamName){
			this.teamName = teamName;
		}

		public int getTeamRank(){
			return this.teamRank;
		}

		public int setRank(int teamRank){
			return this.teamRank = teamRank; // "//" Skal fjernes hvis man ikke skal tjekke.
		}
		
		
	//Tess' måde --> så man ikke hele tiden skal skrive s1.getName()+...
	@Override // Så vil den hjælpe til at finde fejl
	public String toString(){ 
		return "Hold: " + teamName + " - Rang: " + teamRank;
	}
	
	
	
}