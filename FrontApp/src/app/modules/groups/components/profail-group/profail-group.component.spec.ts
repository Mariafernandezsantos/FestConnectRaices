import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfailGroupComponent } from './profail-group.component';

describe('ProfailGroupComponent', () => {
  let component: ProfailGroupComponent;
  let fixture: ComponentFixture<ProfailGroupComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProfailGroupComponent]
    });
    fixture = TestBed.createComponent(ProfailGroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
