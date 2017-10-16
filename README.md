# Trabalhopatterns
Projeto: Drone Girassol
O projeto foi construído com intuito de de aplicar diversos Desing Patterns em ações para meu projeto que foi escolhido para monitorar e atualizar modo de vôos em um drone.  Desing utilizados nesse projeto foram Strategy, State, Observer e o Proxy totalizando 4 desing diferentes.

Strategy foi utilizado no projeto para construir os tipos de modos de vôos que serão utilizados para o drone. Nesse caso foi feito um modo GPS e um Modo ATT  que é um tipo de vôo automático usando o barômetro da aeronave.

State foi utilizado para determinar um tipo de estado no qual pode ser normal que terá comportamentos típicos como modo de Vôo em GPS e modo de vôo ATT que é a aeronave voando manual com ajuda do barômetro  e o outro estado será Fail Safe que simboliza a perda de sinal da aeronave alterando seu estado  de normal para Fail Safe determinado a volta pra casa automatico.

Observer foi utilizado para monitorar a bateria da aeronave enviando uma notificação para o celular que a bateria estaria com carga baixa oferecendo perigo para aeronave.

Proxy foi utilizado para para configurar uma condição especial que só permitirá a aeronave voar caso tenha adquirido o sinal de Gps resguardando assim a segurança da aeronave.  

