particle-physics
================

WIP. Still thinking what could possibly come out of all this.
***
####Particle UML:
<p align="center">
<img src="http://i.imgur.com/tNQq1xl.jpg">
</p>

####Elementary Particle UML:
<p align="center">
<img src="http://i.imgur.com/alPzoQA.jpg">
</p>
***
Current result of a simple:
```
for (Particle p : Loader.getElementaryParticles())
			System.out.println(p + "\n");
```
Output:
```
Name: up quark
Mass: 2.3 + 0.7 - 0.5 MeV/c^2
Charge: 2/3
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > QUARK

Name: down quark
Mass: 4.8 + 0.5 - 0.3 MeV/c^2
Charge: -1/3
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > QUARK

Name: charm quark
Mass: 1.29 + 0.05 - 0.11 GeV/c^2
Charge: 2/3
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > QUARK

Name: strange quark
Mass: 95 + 5 - 5 MeV/c^2
Charge: -1/3
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > QUARK

Name: top quark
Mass: 173.34 ± 0.27 (stat) ± 0.71 (syst) GeV/c^2
Charge: 2/3
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > QUARK

Name: bottom quark
Mass: 4.18 + 0.03 - 0.03 GeV/c^2
Charge: -1/3
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > QUARK

Name: electron
Mass: 0.510998928(11) MeV/c^2
Charge: -1
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > LEPTON

Name: electron neutrino
Mass: < 2.2 eV/c^2
Charge: 0
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > LEPTON

Name: muon
Mass: 105.6583715(35) MeV/c^2
Charge: -1
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > LEPTON

Name: muon neutrino
Mass: < 0.17 MeV/c^2
Charge: 0
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > LEPTON

Name: tau
Mass: 1776.82 ± 0.16 MeV/c^2
Charge: -1
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > LEPTON

Name: tau neutrino
Mass: < 15.5 MeV/c^2
Charge: 0
Spin: 1/2
Particle Type: ELEMENTARY > FERMION > LEPTON

Name: gluon
Mass: 0
Charge: 0
Spin: 1
Particle Type: ELEMENTARY > BOSON > GAUGE

Name: photon
Mass: 0
Charge: 0
Spin: 1
Particle Type: ELEMENTARY > BOSON > GAUGE

Name: Z boson
Mass: 2.4952 ± 0.0023 GeV/c^2
Charge: 0
Spin: 1
Particle Type: ELEMENTARY > BOSON > GAUGE

Name: W boson
Mass: 2.085 ± 0.042 GeV/c^2
Charge: ±1
Spin: 1
Particle Type: ELEMENTARY > BOSON > GAUGE

Name: Higgs boson
Mass: 126.0 ± 0.4 (stat) ± 0.4 (sys) GeV/c^2
Charge: 0
Spin: 0
Particle Type: ELEMENTARY > BOSON > HIGGS
```
