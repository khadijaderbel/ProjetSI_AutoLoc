package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Maintenance;
import tn.esprit.projet.repository.MaintenanceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceS implements IMaintenance {
    public final MaintenanceRepository mr;

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return mr.save(m);
    }

    @Override
    public void deleteMaintenance(Maintenance m) {
        mr.delete(m);
    }

    @Override
    public List<Maintenance> show() {
        return mr.findAll();
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return mr.save(m);
    }

    @Override
    public Maintenance getmaintenanceByid(Long id) {
        return mr.findById(id).get();
    }
}
