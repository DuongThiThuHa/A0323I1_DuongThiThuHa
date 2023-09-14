create
database mo_hinh;
use
mo_hinh;

create table phieu_xuat
(
    SoPX     int not null primary key,
    NgayXuat date
);

create table vat_tu
(
    MaVTU  int not null primary key,
    TenVTU varchar(50)
);

create table phieu_nhap
(
    SoPN     int not null primary key,
    NgayNhap date
);

create table don_dat_hang
(
    SoDH   int not null primary key,
    NgayDH date
);

create table nha_cung_cap
(
    MaNCC  int not null primary key,
    TenNCC varchar(50),
    DiaChi varchar(50),
    SDT    varchar(11)
);

create table chi_tiet_phieu_xuat
(
    DGXuat int,
    SLXuat int,
    SoPX   int,
    MaVTU  int,
    primary key (SoPX, MaVTU),
    foreign key (SoPX) references Phieu_Xuat (SoPX),
    foreign key (MaVTU) references Vat_Tu (MaVTU)
);

create table chi_tiet_phieu_nhap
(
    DGNhap int,
    SLNhap int,
    SoPN   int,
    MaVTU  int,
    primary key (SoPN, MaVTU),
    foreign key (SoPN) references Phieu_Nhap (SoPN),
    foreign key (MaVTU) references Vat_Tu (MaVTU)
);

create table chi_tiet_dat_hang
(
    SoDH  int,
    MaVTU int,
    primary key (SoDH, MaVTU),
    foreign key (SoDH) references don_dat_hang (SoDH),
    foreign key (MaVTU) references Vat_Tu (MaVTU)
);
