import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ElencoClientiComponent } from './elenco-clienti/elenco-clienti.component';
import { OpportunitaComponent } from './opportunita/opportunita.component';
import { ApppuntamentiComponent } from './apppuntamenti/apppuntamenti.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path: "elenco-clienti", component: ElencoClientiComponent},
  {path: "opportunita", component: OpportunitaComponent},
  {path: "appuntamenti", component: ApppuntamentiComponent},
  {path: "", component: HomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
