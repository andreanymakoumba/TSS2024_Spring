import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OpportunitaComponent } from './opportunita.component';

describe('OpportunitaComponent', () => {
  let component: OpportunitaComponent;
  let fixture: ComponentFixture<OpportunitaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [OpportunitaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(OpportunitaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
