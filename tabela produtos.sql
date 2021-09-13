use estoque_plus;

create table tbprodutos(
idproduto int primary key not null auto_increment,
nomeproduto varchar(50) not null,
tipoproduto varchar(50),
quantidadeproduto int not null
);

insert into tbprodutos(nomeproduto,tipoproduto,quantidadeproduto)
values ("Arroz","Alimentos",12);

insert into tbprodutos(nomeproduto,tipoproduto,quantidadeproduto)
values ("Fichário","Escritório",15);

insert into tbprodutos(nomeproduto,tipoproduto,quantidadeproduto)
values ("Martelo","Ferramentas",3);

insert into tbprodutos(nomeproduto,tipoproduto,quantidadeproduto)
values ("Tablet","Eletrônicos",7);

insert into tbprodutos(nomeproduto,tipoproduto,quantidadeproduto)
values ("Conj Talheres","Utensílios de Cozinha",4);

insert into tbprodutos(nomeproduto,tipoproduto,quantidadeproduto)
values ("Conj Toalhas","Cama, Mesa e Banho",3);

select * from tbprodutos;