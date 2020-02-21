package br.com.ramtravel.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.ramtravel.R;
import br.com.ramtravel.model.Package;

public class PackageDAO {
    List <Package> packages;

    public List<Package> getAllPackagesAvailable(){
        packages = new ArrayList<>();
        packages.add(new Package("Belo Horizonte",R.drawable.belo_horizonte_mg,2,new BigDecimal(350.99)));
        packages.add(new Package("Foz do iguaçcu",R.drawable.foz_do_iguacu_pr,5,new BigDecimal(550.99)));
        packages.add(new Package("Recife",R.drawable.recife_pe,7,new BigDecimal(1350.00)));
        packages.add(new Package("Rio de Janeiro",R.drawable.rio_de_janeiro_rj,3,new BigDecimal(578.99)));
        packages.add(new Package("Salvador",R.drawable.salvador_ba,1,new BigDecimal(180)));
        packages.add(new Package("São Paulo",R.drawable.sao_paulo_sp,4,new BigDecimal(3290.0)));

        return packages;
    }
}
