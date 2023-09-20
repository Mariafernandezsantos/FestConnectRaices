import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FeaturesArtistComponent } from './features-artist.component';

describe('FeaturesArtistComponent', () => {
  let component: FeaturesArtistComponent;
  let fixture: ComponentFixture<FeaturesArtistComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FeaturesArtistComponent]
    });
    fixture = TestBed.createComponent(FeaturesArtistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
