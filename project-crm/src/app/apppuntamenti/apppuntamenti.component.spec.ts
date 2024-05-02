import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApppuntamentiComponent } from './apppuntamenti.component';

describe('ApppuntamentiComponent', () => {
  let component: ApppuntamentiComponent;
  let fixture: ComponentFixture<ApppuntamentiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ApppuntamentiComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ApppuntamentiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
