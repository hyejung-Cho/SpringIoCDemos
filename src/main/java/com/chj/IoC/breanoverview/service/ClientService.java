package com.chj.IoC.breanoverview.service;

public class ClientService {
    private ClientService clientInstance;
    private AccountService accountInstance;

	public ClientService() {
		System.out.println("ClientService created. default Constructor");
	}
	
	public ClientService createClientServiceInstance() {
		if(this.clientInstance == null) {
			this.clientInstance = new ClientService();
		}
		
		System.out.println("****** ClientService created Instance.");
		
		return this.clientInstance;
	}
}
