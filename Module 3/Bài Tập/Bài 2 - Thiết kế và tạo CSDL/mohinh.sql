create database mohinh;
use mohinh;

create table mohinh.phieuxuat(
    sopx int auto_increment primary key,
    ngayxuat date
);

create table mohinh.vattu(
   mavt int primary key,
   tenvt varchar(50)
);

create table mohinh.phieunhap(
   sopn int auto_increment primary key,
   ngaynhap date
);

create table mohinh.vattuphieuxuat(
    idphieuxuat int,
    idvattu int,
    dgxuat float,
    slxuat int,
	primary key(idphieuxuat,idvattu),
    foreign key (idphieuxuat) references mohinh.phieuxuat(sopx),
	foreign key (idvattu) references mohinh.vattu(mavt)
);

create table mohinh.vattuphieunhap(
    idphieunhap int,
    idvattu int,
    dgnhap float,
    slnhap int,
	primary key(idphieunhap,idvattu),
	foreign key (idphieunhap) references mohinh.phieunhap(sopn),
    foreign key (idvattu) references mohinh.vattu(mavt)
);

create table mohinh.dondathang(
    sodh int auto_increment primary key,
    ngaydh date
);

create table mohinh.nhacungcap(
    mancc  int auto_increment primary key,
    tenncc varchar(50),
    diachi varchar(50),
    sdt varchar(50)
);

create table mohinh.chitietdonhang(
    iddonhang  int,
    idvattu int,
    primary key (iddonhang, idvattu),
    foreign key (iddonhang) references mohinh.dondathang(sodh),
	foreign key (idvattu) references mohinh.vattu(mavt)
);

create table mohinh.cungcap(
    idncc int,
    iddonhang  int,
    primary key (idncc, iddonhang),
	foreign key(idncc) references mohinh.nhacungcap(mancc),
    foreign key (iddonhang) references dondathang(sodh)
);