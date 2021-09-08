-- cria banco de dados
create database estoque_plus;

-- ativa o banco de dados
use estoque_plus;

-- cria a tabela de usuários
create table tbusuarios(
	iduser int primary key,
    usuario varchar(50) not null,
    fone varchar(16),
    login varchar(15) not null unique,
    senha varchar(15) not null
);
-- Adicionar novos dados na tabela  usuários
insert into tbusuarios(iduser,usuario,fone,login,senha)
values (1,'Tony Stark','(99) 98765-4321','ironman','ironman');
insert into tbusuarios(iduser,usuario,fone,login,senha)
values (2,'Peter Parker','(55) 99876-6789','spiderman','spiderman');
insert into tbusuarios(iduser,usuario,fone,login,senha)
values (3,'Stan Lee','(99) 99999-9999','marvel','marvel');
insert into tbusuarios(iduser,usuario,login,senha)
values (99,'Bruce Wayne','batman','batman');

-- Criar tabela de clientes
create table tbclientes(
idcliente int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100),
fonecli varchar(50) not null,
emailcli varchar(50)
);

-- Adicionar novos dados na tabela clientes
insert into tbclientes (nomecli,endcli,fonecli,emailcli)
values ('Tia May', 'Hometown, 751', '(98) 99999-6321','s2benpkr@gmail.com');

insert into tbclientes (nomecli,endcli,fonecli,emailcli)
values ('Teste 1', 'Teste Endereço', '(56) 98745-6321','testeemail@gmail.com');








